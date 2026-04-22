package com.microservices.account.entity;


@Entity
@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor
public class Customers {
    @Id
    @GeneratedValue(strtegy=GenerationType.IDENTITY)
    private long customerId;

// sudo update-alternatives --config java
// ls /usr/lib/jvm/


/**
 * sudo update-alternatives --install /usr/bin/java java /usr/lib/jvm/java-17-openjdk-amd64/bin/java 1711
 * sudo update-alternatives --install /usr/bin/javac javac /usr/lib/jvm/java-17-openjdk-amd64/bin/javac 1711
 * sudo update-alternatives --config java
 * sudo update-alternatives --config javac
 * export JAVA_HOME=/usr/lib/jvm/java-17-openjdk-amd64
 * export PATH=$JAVA_HOME/bin:$PATH
 * source ~/.bashrc 
 * java -version
 * javac -version
 * 
 */
}
