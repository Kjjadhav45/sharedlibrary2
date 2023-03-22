def newDownload(repo)
{
  git "https://github.com/kjjadhav45/${repo}"
}
def newBuild()
{
   sh 'mvn package' 
}
