pipeline {
    agent any
//     tools {
//         maven '3.6.3'
//         jdk 'jdk8'
//     }

    environment {
        registry = "thawedbuffalosolutions/greetings-svc"
        registryCredential = 'thawedbuffalosolutions'
        dockerImage = ''
    }
    stages {
        stage("setup") {
            steps {
                sh '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                    '''
            }
        }

        stage("build"){
            steps{
                echo "building the application..."
                sh 'mvn package'
            }
        }

        stage("test"){
            steps{
                echo "testing the application..."
                sh 'mvn test'
            }
        }

        stage("build-container") {
            steps{
                echo "building docker image..."
                script {
                    dockerImage = docker.build registry + ":$BUILD_NUMBER"
                }
            }
        }

        stage("deploy-container-to-hub") {
            steps {
                echo "deploying image to Docker hub..."
                script {
                    docker.withRegistry('', registryCredential) {
                        dockerImage.push()
                    }
                }
            }
        }
    }

    post {
        always {
            echo "pipeline completed..."
            echo "cleaning up..."
            sh "docker rmi $registry:$BUILD_NUMBER"
        }
        failure {
            echo "pipeline failed..."
        }
        success {
            echo "pipeline completed successfully..."
        }
    }
}