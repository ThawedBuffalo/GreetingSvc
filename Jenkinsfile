pipeline {
    agent any
//     tools {
//         maven '3.6.3'
//         jdk 'jdk8'
//     }
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
            }
        }


    }

    post {
        always {
            echo "pipeline completed..."
        }
        failure {
            echo "pipeline failed..."
        }
        success {
            echo "pipeline completed successfully..."
        }
    }
}