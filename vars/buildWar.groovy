def call() {
    stage('Build WAR') {
        sh 'mvn clean package'
    }
}
