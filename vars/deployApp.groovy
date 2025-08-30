def call(String env) {
    if (env == "dev") {
        echo "🚀 Deploying to Development server..."
    } else if (env == "prod") {
        echo "🚀 Deploying to Production server..."
    } else {
        error "❌ Unknown environment: ${env}"
    }
}