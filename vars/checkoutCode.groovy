def call(String branch = 'main', String repoUrl) {
    stage('Checkout') {
        checkout([
            $class: 'GitSCM',
            branches: [[name: "*/${branch}"]],
            userRemoteConfigs: [[url: repoUrl]]
        ])
    }
}
