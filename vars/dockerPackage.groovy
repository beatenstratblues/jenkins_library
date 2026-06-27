def call(String DOCKER_REPOUSER, String DOCKER_IMAGE, String IMAGE_TAG) {
    echo "Building Docker image..."
    sh "docker build -t ${DOCKER_REPOUSER}/${DOCKER_IMAGE}:${IMAGE_TAG} -t ${DOCKER_REPOUSER}/${DOCKER_IMAGE}:${IMAGE_TAG} ."
}