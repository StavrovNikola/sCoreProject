pipeline {
    agent any
    environment {
        JAVA_HOME = 'C:\\Program Files\\Eclipse Adoptium\\jdk-21.0.4.7-hotspot'
        PATH = "${JAVA_HOME}\\bin;${env.PATH}"
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Build') {
            steps {
                bat './mvnw.cmd clean install'
            }
        }
        stage('Test') {
            steps {
                bat './mvnw.cmd test'
            }
        }
        stage('Package') {
            steps {
                bat './mvnw.cmd package'
            }
        }
        stage('Generate Allure Report') {
            steps {
                bat './mvnw.cmd allure:report'
            }
        }
    }
    post {
        always {
            archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            allure includeProperties: false, jdk: '', results: [[path: 'C:\Users\rss0108\AquaProjects\sCoreProject\allure-results']]
        }
    }
}
