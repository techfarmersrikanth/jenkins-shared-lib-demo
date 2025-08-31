def call(String credentialsId, String tomcatUrl, String contextPath = 'hello') {
    stage('Deploy to Tomcat') {
        script {
            def warFile = sh(script: "ls target/*.war | head -n 1", returnStdout: true).trim()
            echo "Deploying WAR file: ${warFile}"

            deploy adapters: [
                tomcat9(
                    alternativeDeploymentContext: '',
                    credentialsId: credentialsId,
                    path: '',
                    url: tomcatUrl
                )
            ],
            contextPath: contextPath,
            war: warFile
        }
    }
}
