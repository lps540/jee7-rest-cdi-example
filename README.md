jee7-rest-cdi-example
=====================

Trivial example that uses CDI to inject a POJO into a REST service. Notice that beans.xml under WEB-INF needs to be present but can be completely empty.

Build using: gradle war

Test using: curl http://127.0.0.1:8080/jee7-rest-cdi-example/rest/ultimate/answer

Tested with WildFly 8.1.0.Final running under JDK8.
