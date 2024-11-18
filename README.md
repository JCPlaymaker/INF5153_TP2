Here is some code to test certain HTTPRequests
```
(async function deleteLogement(id) {
          await fetch("http://localhost:8080/logement/" + id, {
                    method: "DELETE"
          })
})("1")
```
