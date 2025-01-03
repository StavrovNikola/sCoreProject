pipeline {
    agent any
    tools {
        jdk 'Java_21'       // Replace 'Java_21' with the JDK configured in Jenkins
        maven 'Maven_3.8.1' // Replace 'Maven_3.8.1' with the Maven configured in Jenkins
    }
    environment {
        ALLURE_RESULTS = 'target/allure-results'
    }
    stages {
        stage('Checkout') {
            steps {
                // Clone the repository
                git branch: 'master', url: 'https://github.com/StavrovNikola/sCoreProject.git'
            }
        }
        stage('Build') {
            steps {
                // Clean and build the Maven project
                bat 'mvn clean install'
            }
        }
        stage('Run Tests') {
            steps {
                // Run Selenium TestNG tests
                bat 'mvn test'
            }
        }
        stage('Generate Allure Report') {
            steps {
                // Generate Allure report
                bat 'mvn allure:report'
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
