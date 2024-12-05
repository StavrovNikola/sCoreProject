pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Build') {
            steps {
                bat './mvnw clean install'
            }
        }
        stage('Test') {
            steps {
                bat './mvnw test'
            }
        }
        stage('Package') {
            steps {
                bat './mvnw package'
            }
        }
    }
    post {
        always {
            archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
        }
    }
}
