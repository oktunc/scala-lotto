GIT
===========
git config --global user.name "Example Surname"
git config --global user.email "your.email@gmail.com"
# Set default so that all changes are always pushed to the repository
git config --global push.default "matching"
#To query your Git settings
git config --list

git config --global color.status auto
git config --global color.branch auto



# Initialize the local Git repository
git init
# Add all (files and directories) to the Git repository
git add .
# Make a commit of your file to the local repository
git commit -m "Initial commit"
# Show the history of commits in the current branch
git log
# This starts a nice graphical view of the changes
gitk --all
#add remote repository
git remote add scala-lotto git@github.com:oktunc/scala-lotto.git

mvn scala:run -DmainClass=oktunc.scala.lotto.Sample