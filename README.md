# Metrics demo project

Демо-проект для сбора метрки SpringBoot приложения. [Пример с гитхаб](https://habr.com/ru/post/548700/).

### Запуск проекта:
```
docker-copmpose up -d
```

### Ссылки
* [Actuator info](http://localhost:8099/actuator)
* [All actuator metrics](http://localhost:8099/actuator/prometheus)
* [Ping java-app](http://localhost:8099/api/v1/ping)
* [Grafana gui](http://localhost:3000)
* [Prometheus](http://localhost:9090)

### Дашборды:
* [JVM](https://grafana.com/grafana/dashboards/4701)
* [Micrometer requests count](https://grafana.com/grafana/dashboards/5373)
* [SpringBoot](https://habr.com/ru/post/548700/)
