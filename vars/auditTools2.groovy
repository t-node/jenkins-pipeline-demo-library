def call(Map config) {
    node {
      echo "${config.message}"
        echo "${config.name}"  
      sh '''
        git version
        docker version
        dotnet --list-sdks
        dotnet --list-runtimes
      '''
    }
}
