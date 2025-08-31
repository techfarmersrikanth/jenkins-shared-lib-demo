def call(Map config) {
    // Ensure required arguments exist
    if (!config.credentialsId || !config.tomcatUrl || !config.warFile || !config.contextPath) {
        error "Missing required arguments: credentialsId, tomcatUrl, warFile, contextPath"
    }

    withCredentials([usernamePassword(
        credentialsId: config.credentialsId,
        usernameVariable: 'TOMCAT_USER',
        passwordVariable: 'TOMCAT_PASS'
    )]) {
        sh """
            curl --fail -u $TOMCAT_USER:$TOMCAT_PASS \
                --upload-file ${config.warFile} \
                "${config.tomcatUrl}/manager/text/deploy?path=/${config.contextPath}&update=true"
        """
    }
}
