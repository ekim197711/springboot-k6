import { check } from "k6";
import http from "k6/http";
export const options = {
    // insecureSkipTLSVerify: true
};
export default function() {
    // let res = http.get("http://localhost:8080/api/navigation");
    let res = http.get("https://34.160.93.194:443/connect?login=9000000001234&password=ba367bc0ea8b14bf701f9b9272c2cbde&data=<postman>somedata</postman>");

    check(res, {
        "is status 200": (r) => r.status === 200
    });
};