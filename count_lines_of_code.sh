#!/bin/bash
echo "Non-empty lines"

echo "Java:"
find ./ -name "*.java" | xargs egrep -v "^$" | wc -l

echo "Java in Scala:"
find ./ -name "*.scala" | egrep "javascala" | xargs egrep -v "^$" | wc -l

echo "More idiomatic Scala:"
find ./ -name "*.scala" | grep -v "javascala" | xargs egrep -v "^$" | wc -l

