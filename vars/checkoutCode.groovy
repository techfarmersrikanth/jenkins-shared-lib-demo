def call(Map args = [:]) {
    def branch = args.get('branch', 'main')
    def repoUrl = args.get('repoUrl')

    if (!repoUrl) {
        error "repoUrl is required for checkoutCode step!"
    }

    checkout([
        $class: 'GitSCM',
        branches: [[name: "*/${branch}"]],
        userRemoteConfigs: [[url: repoUrl]]
    ])
}
