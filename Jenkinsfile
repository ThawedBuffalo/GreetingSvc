pipeline {
    agent any

    stage("build"){
        steps{
            echo "building the application..."
        }
    }

    stage("build"){
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