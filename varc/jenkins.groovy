def call(Map config){
pipeline{

agent any

tools {
  maven 'maven-test'
}
stages{
 //this stage for checkout
 stage('checkout'){
 steps{
 git branch: 'config.branch', url: 'config.repourl'
}
}
}
}
