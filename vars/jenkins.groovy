def call(Map config){
pipeline{

agent any

tools {
  maven "${config.mavent}"
}
stages{
 //this stage for checkout
 stage('checkout'){
 steps{
 git branch: config.branch, url: config.repourl
}
}
 //this stage for build
 stage('build'){
 steps{
 sh "mvn ${config.mavnecommand}"
}
}
}
}
}
