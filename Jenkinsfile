#!groovy
pipeline {
    agent any

    environment {
        image_label = "bookings-microservice-ab"
        ecr_uri = "${}"
        git_commit_hash = "${sh(returnStdout: true, script: 'git rev-parse HEAD')}"
        image = ""
    }

    stages {
        stage('Package') {
            steps {
                sh "./mvnw package"
            }
        }

        stage('Build') {
            steps {
                script {
                    image = docker.build image_label
                }
            }
        }

        stage('Push to registry') {
            steps {
                script {
                    docker.withRegistry(BOOKINGS_ECR_URI, "ecr:us-west-2:credential-id") {
                        image.push("$git_commit_hash")
                        image.push('latest')
                    }
                }
            }
        }

        stage('Clean up') {
            steps {
                sh "./mvnw clean"
                sh "docker rmi $image_label:$git_commit_hash"
                sh "docker rmi $image_label:latest"
            }
        }
    }
}


