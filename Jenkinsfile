pipeline {
    agent any

    stages {
        stage('build') {
            steps {
                echo 'yesss building the application...'
                maven(
                    name: 'maven 3.9.9',  
                    goals: 'install'
                )
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

