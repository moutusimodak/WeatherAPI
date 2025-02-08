pipeline {
    agent any

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

