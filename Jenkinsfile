pipeline {
    agent any

    stages {

        stage("build"){
            steps{
                echo "building the application..."
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