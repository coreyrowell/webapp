# Prerequisites
[JDK 8] or greater [Wildfly 9.0.0] or greater.

# Checkout Sources
```
git clone https://github.com/coreyrowell/webapp.git
```

# Install Maven Dependencies
```
cd webapp
mvn install
```

# Build Angular Frontend
```
cd /src/main/webapp/static/
npm install
bower install
grunt build
```

# Import pom.xml into IDE

[JDK 8]:http://openjdk.java.net/
[Wildfly 9.0.0]:http://wildfly.org/downloads/
