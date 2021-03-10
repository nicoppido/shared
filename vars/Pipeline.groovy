def call(){
    try {
        pipeline {
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
