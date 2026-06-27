def call() {
    echo 'Installing dependencies using npm ci...'
    sh 'NODE_OPTIONS="--max-old-space-size=4096" npm ci'
}