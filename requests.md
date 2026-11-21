# Приклади запитів

## Перелік книг
```bash
curl http://localhost:8080/api/books
```

## Одна книга
```bash
curl http://localhost:8080/api/books/1
```

## Неіснуюча книга (404)
```bash
curl -i http://localhost:8080/api/books/999
```