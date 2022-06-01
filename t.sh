# 启动容器
docker run \
 -itd  \
 -p 9980:80 \
 -p 9922:22 \
 -v /Users/wangguanghui/gitlab/etc:/etc/gitlab  \
 -v /Users/wangguanghui/gitlab/log:/var/log/gitlab \
 -v /Users/wangguanghui/gitlab/opt:/var/opt/gitlab \
 --restart always \
 --privileged=true \
 --name gitlab \
 gitlab/gitlab-ce


