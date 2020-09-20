pipeline {
    agent any

    stages("build"){
        steps{
            echo "building the application..."
        }
    }

    stages("build"){
        steps{
            echo "building the application..."
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