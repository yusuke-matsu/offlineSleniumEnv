### prerequirement

- gradle2.14.1
- jdk1.8

### 各ファイルの意味 (勉強中。。。)
- build.gradle: gradleにてbuildする際の設定ファイル。言語はgroovy。dependencyの記載やタスクの設定を行う
- gradle.properties: gradleの設定ファイル。読み込みを行うjdkの場所やJVM、プロキシの設定などが可能
- settings.gradle: gradleのrootprojectをしている。


### 導入手順

1. gradleのv2.14.1をダウンロード
2. jdkの1.8をダウンロード
3. ダウンロードしたjdkとgradleをtoolsの中に突っ込む
4. gradle.propertiesにjdkのパスを記載する
5. driverの中に自分が動かしたいブラウザのseleniumドライバーを入れる
6. 環境変数にgradleのパスを通す。
   参考：https://qiita.com/quwahara/items/9c4e5fbda421cfcb09ad
7. JAVAHOMEが環境変数に設定されていない場合はする（gradleを起動するために必要）。
8. テストしたいコードをsrc -> test -> javaの配下に入れる
9. テストが完成したら以下コマンドにて実行 "gradle -g libs clean build"

9については一度libsに必要な依存性を全て持ってくるただし、offline環境の場合
再度dependencyを取りにいきエラーになる可能性があるので、build.gradleで必要な
依存性はlibsから持ってくるように向き先を変えることが必要。

次のテストからは”gradle test”にて実行できるはず。。。

### need to check
1. gradle testの中でテストが途中でハングすると最後まで行かずレポートを吐いてくれない
2. gitにて管理する際には、gitignoreでlibsとtoolsを読み込まないことにしているがgitのリポジトリ先にて
   jenkinsを利用して起動させる際にはこの点について考慮が必要。サーバーサイドにgradleとjdkを入れないといけない
   gitignoreしないと、ファイルが複製される為、物理的な容量を圧迫してしまう。
3. Javadocの生成時にUTF-8が文字化けする。JVMの設定値だった気がする。。。。

### 参考サイト
https://qiita.com/navekazu/items/af886fa200be8a683132
