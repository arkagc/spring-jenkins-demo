pipeline{
    agent any
    tools{
        maven 'maven 3.8.6'
    }
    stages{
        stage('Build Maven'){
            steps{
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/arkagc/spring-jenkins-demo']])
                bat 'mvn clean install'
            }
        }
        stage('Docker Image Build'){
            steps{
                script{
                    bat 'docker build -t jenkins-demo-0.0.1-SNAPSHOT .'
                }
            }
        }
    }
}