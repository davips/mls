echo `expr $(git shortlog -s -n | grep davips | cut -d'd' -f1 | head -n1) + 1` > minV
echo $(cat majV).$(cat minV) > VERSION
cat VERSION
