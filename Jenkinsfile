pipeline {
    agent any
  environment {
      JAVA_HOME = 'C:\\Program Files\\Eclipse Adoptium\\jdk-21.0.4.7-hotspot'  // Escaped backslashes
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
    }
    post {
        always {
            archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
        }
    }
}
