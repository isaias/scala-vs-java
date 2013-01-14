#!/bin/bash
echo "Non-empty lines"

echo "Java:"
find ./ -name "*.java" | xargs egrep -v "^$" | wc -l

echo "Scala:"
find ./ -name "*.scala" | xargs egrep -v "^$" | wc -l
