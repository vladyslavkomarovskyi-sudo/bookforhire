# Приклади запитів — Bookforhire (заняття 1/1)

Бекенд має бути запущений (порт 8080):

```bash
./mvnw spring-boot:run
```

На Windows: `mvnw.cmd spring-boot:run`, або запустіть `BookforhireApplication` з IntelliJ IDEA.

На цьому занятті є лише **два GET-ендпоінти** (читання). Початкові книги додає `BookSeeder` під час запуску.

---

## 1. Перелік книг (картки)

```bash
curl http://localhost:8080/api/books
```

Очікувана відповідь (скорочено):
```json
[
  { "id": 1, "title": "Кобзар", "author": "Тарас Шевченко", "price": 250.00, "coverUrl": "/covers/kobzar.jpg" },
  { "id": 2, "title": "Тіні забутих предків", "author": "Михайло Коцюбинський", "price": 180.00, "coverUrl": "/covers/tini.jpg" },
  { "id": 3, "title": "Лісова пісня", "author": "Леся Українка", "price": 160.00, "coverUrl": "/covers/lisova-pisnia.jpg" },
  { "id": 4, "title": "Intermezzo", "author": "Михайло Коцюбинський", "price": 150.00, "coverUrl": "/covers/intermezzo.jpg" },
  { "id": 5, "title": "Захар Беркут", "author": "Іван Франко", "price": 200.00, "coverUrl": "/covers/zakhar-berkut.jpg" }
]
```

Гарний вивід (якщо встановлено `jq`):
```bash
curl -s http://localhost:8080/api/books | jq
```

---

## 2. Одна книга з деталями

```bash
curl http://localhost:8080/api/books/1
```

Очікувана відповідь:
```json
{
  "id": 1,
  "title": "Кобзар",
  "author": "Тарас Шевченко",
  "price": 250.00,
  "year": 1840,
  "coverUrl": "/covers/kobzar.jpg",
  "description": "Збірка поетичних творів.",
  "genre": "Поезія"
}
```

---

## 3. Книга, якої немає → 404

```bash
curl -i http://localhost:8080/api/books/999
```

Очікувано: перший рядок `HTTP/1.1 404`.

---

## 4. Обкладинки віддаються як статика

```bash
curl -I http://localhost:8080/covers/kobzar.jpg
```

Очікувано: `HTTP/1.1 200` і `Content-Type: image/jpeg`.

---

> Примітка для Windows PowerShell: `curl` там є псевдонімом `Invoke-WebRequest`.
> Використовуйте `curl.exe`, наприклад: `curl.exe -i http://localhost:8080/api/books/999`.
