def call(def config){
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
