pipeline {
    agent { dockerfile true }

    environment {
        registry = "thawedbuffalosolutions/greetings-svc"
        registryCredential = 'thawedbuffalosolutions'
        dockerImage = 'greetingsSvcDockerImage'
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
                docker.build("dockerImage:${env.BUILD_ID}")
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