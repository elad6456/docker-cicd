pipeline {
    agent any

    stages {
        stage('Pre-build stg') {
            steps {
                echo 'prebuild actions..'
            }
        }
        stage('Build') {
            steps {
              echo 'docker build --target Build'
            }
        }
        stage('Test') {
            steps {
                echo 'docker build --target test'
            }
        }
        stage('security') {
            /*agent {
                docker { image 'alpine:latest' }
            }*/
            steps {
                sh 'echo "this is security"'
            }
        }
        stage('Back-end') {
            /*agent {
                docker { image 'maven:3.8.1-adoptopenjdk-11' }
            }*/
            steps {
                /*sh 'mvn --version'*/
                echo "sh 'mvn --version"
            }
        }
        stage('Front-end') {
            /*agent {
                docker { image 'node:16.13.1-alpine' }
            }*/
            steps {
                /*sh 'node --version'*/
                echo "sh 'node --version'"
            }
        }
        stage('Deploy') {
            /*agent {
                docker { image 'aws-cli:latest' }
            }*/
            steps {
                echo "sh 's3 cp src dst'"
            }
        }
        stage ('Post') {
            steps {
                echo "clear env"
            }
        }
      
    }
}
