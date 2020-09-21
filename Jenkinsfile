pipeline {
    agent any
    tools {
        maven 'Maven 3.5.4'
        jdk 'jdk14'
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