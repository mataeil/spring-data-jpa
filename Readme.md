# Spring-data-jpa
spring data jpa 예제 코드

## Redis
> redis project
1. redis 설치 (docker)
```
$ docker run -p 6379:6379 --name redis_boot -p redis
$ redis exec -i -t redis_boot redis-cli
```
2. StringRedistTemplate
3. @RedisHash
## Mongo
> mongo project
```
$ docker run -p 27017:27017 --name mongo_boot -d mongo
$ docker exec -it mongo_boot bash
$ mongo
```
2. MongoTemplate
3. MongoRepository
4. @DataMongoTest<br />
Repository 레이어 슬라이싱 테스트를 하기 위함
5. 내장형 MongoDB(테스트용)<br />
de.flapdoodle.embed:de.flapdoodle.embed.mongo
## Neo4j
> neo4j proejct
1. neo4j 설치 (docker)
```
$ docker run -p 7474:7474 -p 7687:7687 --name neo4j_boot -d neo4j
```
2. neo4j browser
> http://localhost:7474/browser/
3. SessionFactory
4. Neo4jRepository
4. @NodeEntity
5. Neo4jTemplate(Deprecated)

