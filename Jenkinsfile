pipeline {
    agent any
    tools {
        maven 'maven-3.9.9'  // This should match the name you set in Global Tool Configuration
    }

    stages {
        stage('build') {
            steps {
                echo 'yesss building the application...'
                sh 'mvn clean install'
            }
        }
        stage('test') {
            steps {
                echo 'testing the application...'
            }
        }
        stage('deploy') {
            steps {
                echo 'deploying the application...'
            }
        }
    }  
}   

