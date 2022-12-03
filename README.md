[![Tests](https://github.com/NoGe4Ek/telegram-notes-service/actions/workflows/gradle-tests.yml/badge.svg?branch=master)](https://github.com/NoGe4Ek/telegram-notes-service/actions/workflows/gradle-tests.yml)
(Develop
[![Tests](https://github.com/NoGe4Ek/telegram-notes-service/actions/workflows/gradle-tests.yml/badge.svg?branch=dev)](https://github.com/NoGe4Ek/telegram-notes-service/actions/workflows/gradle-tests.yml) )

# Telegram notes service
'_Done for the poly PI course_'

A service that uses the telegram api to get the last N messages of a specific channel (essentially a telegram client).

## Links table
- [Task]
- [Other course projects]

## Usage
You can get access to service on
```
0.0.0.0:8080/glm
```
ATTENTION: don't forget to add chatId parameter by
```
?chatId=<chatId>
```
You also can run docker image by
``` 
git clone https://github.com/NoGe4Ek/telegram-notes-service.git

docker build -t tnsApp .

docker run -p 8080:8080 tnsApp
```

## License
MIT

[//]: # (These are reference links used in the body of this note and get stripped out when the markdown processor does its job. There is no need to format nicely because it shouldn't be seen. Thanks SO - http://stackoverflow.com/questions/4823468/store-comments-in-markdown-syntax)

[Task]: <https://github.com/SemenMartynov/Software-Engineering-2022/blob/main/Task1.md>
[Other course projects]: <https://github.com/SemenMartynov/Software-Engineering-2022>