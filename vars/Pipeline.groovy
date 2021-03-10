def call(){
    try {
        pipeline {
            agent any
            stages {
                stage('Build') {
                    steps{
                        Build(this);
                    }
                }
            }
        }
    }
    catch(e) {
        echo "Error Happened ${e}"
    }
}
