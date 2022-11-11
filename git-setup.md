Command line

git version

git config --global user.name "gautham-hub001"

git config --global user.email "gautham2pothana@gmail.com"


# connecting to remote using SSH key. The below command will generate public key(id_rsa.pub) and private key(id_rsa) in /Users/gauthampothana/.ssh folder

ssh-keygen -t rsa -b 2048 -C "gautham2pothana@gmail.com"

cd /Users/gauthampothana/.ssh

cat id_rsa.pub

# copy the file and open GitHub and open settings and select SSH and GPG keys and select New SSH key
# And paste the key you have copied.

# Now create a repo and copy the cloning url and enter
git clone git@github.com:gautham-hub001/Java.git

# This is very very important(Going inside the cloned repo)
cd Java

# Move all the files into the Java folder

# check if origin is added or not
git remote -v 

# If not 
git remote add origin ssh://git@github.com:gautham-hub001/Java.git # This will add the remote to known_hosts file in .ssh folder

git remote -v 
# output:
origin	ssh://git@github.com:gautham-hub001/Java.git (fetch)
origin	ssh://git@github.com:gautham-hub001/Java.git (push)

# This should not give any errors, if your origin was properly configured.
git fetch origin

git add .

git commit -m "first"

git push origin

	

