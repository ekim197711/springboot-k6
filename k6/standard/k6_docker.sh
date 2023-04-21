cd $(dirname $0)
docker run --network host --rm -i loadimpact/k6 run -u 2 -d 5s -< script.js > somefile.out