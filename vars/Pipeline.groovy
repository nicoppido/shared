def call(){
    try {
        pipeline {
            agent none
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
