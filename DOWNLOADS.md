Gradle Repository
=================

Gradle repository is http://ftp.epages.com/pub/epages/gradle/soapclient/

It was created by:

1. On root@cdp-debian12-04, get the list of files to download:

    cd ~/soapclient
    cat build.gradle.download > build.gradle
    cat gradle-wrapper.properties.download > gradle/wrapper/gradle-wrapper.properties
    ./gradlew build --refresh-dependencies --console=plain 2>/dev/null \
    | awk '/^Download /{print $2}' > DOWNLOADS.list

2. On root@ftp.epages.com, download the files:

    mkdir -p /home/build/pub/epages/gradle/soapclient
    cd /home/build/pub/epages/gradle/soapclient
    file=gradle-2.6-bin.zip
    curl -sLk -o $file https://services.gradle.org/distributions/$file
    cat DOWNLOADS.list | while read url ; do
      echo $url
      file=$(echo $url | sed 's,.*/maven[^/]*/,,')
      mkdir -p ${file%/*}
      curl -sLk $url > $file
    done

Use Gradle repository (example!):

    if [[ ! -d /tmp/gradle/soapclient ]] ; then
      mkdir -p /tmp/gradle
      cd /tmp/gradle
      wget --mirror --no-parent --no-host-directories --cut-dirs=3 --level=inf \
      --execute robots=off --reject "index.html*" --reject-regex "/\?C=[NMSD];O=[AD]" \
      http://ftp.epages.com/pub/epages/gradle/soapclient/
    fi
    cd ~/soapclient
    ./gradlew -Dep6HostName=cdp-debian12-04.vm-intern.epages.com clean check --info
