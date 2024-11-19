Here is some code examples to test certain HTTPRequests\n
To delete a single element:
```
(async function deleteLogement(id) {
          await fetch("http://localhost:8080/logement/" + id, {
                    method: "DELETE"
          })
})("1") // You can change the value for an existing id
```
To add a single element:
```
(async function createLogement() {
          let logement = {"description":"Moyen Condo 3 1/2"}; // You can modify the contents of the request

          await fetch("http://localhost:8080/logement", {
                    method: "POST",
                    headers: {
                              "Accept": "application/json",
                              "Content-Type": "application/json"
                    },
                    body: JSON.stringify(logement)
                    })
                    .then(result => result.text())
                    .then(text => alert(text));
})();
```
