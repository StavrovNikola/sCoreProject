pipeline {
   agent any
   tools {
        jJAVA_HOME = 'C:\\Program Files\\Eclipse Adoptium\\jdk-21.0.4.7-hotspot'
                         PATH = "${JAVA_HOME}\\bin;${env.PATH}"
    }
    environment {
        ALLURE_RESULTS = 'target/allure-results'
    }
    stages {
        stage('Checkout') {
            steps {
                // Clone the repository
                git branch: 'master', url: 'https://github.com/StavrovNikola/sCoreProject.git' // Replace with your repo URL
            }
        }
        stage('Build') {
            steps {
                // Clean and build the Maven project
                sh 'mvn clean install'
            }
        }
        stage('Run Tests') {
            steps {
                // Run Selenium TestNG tests
                sh 'mvn test'
            }
        }
        stage('Generate Allure Report') {
            steps {
                // Generate Allure report
                sh 'mvn allure:report'
            }
        }
        stage('Publish Allure Report') {
            steps {
                // Publish Allure report in Jenkins
                allure includeProperties: false, jdk: '', results: [[path: "${env.ALLURE_RESULTS}"]]
            }
        }
    }
    post {
        always {
            // Archive test results and other build artifacts
            junit 'target/surefire-reports/*.xml'
            archiveArtifacts artifacts: 'target/**/*.jar', allowEmptyArchive: true
        }
    }
}

