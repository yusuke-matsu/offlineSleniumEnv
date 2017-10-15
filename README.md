### prerequirement

- gradle2.14.1
- jre1.8


### 各ファイルの意味 (勉強中。。。)
- build.gradle: gradleにてbuildする際の設定ファイル。言語はgroovy。dependencyの記載やタスクの設定を行う
- gradle.properties: gradleの設定ファイル。読み込みを行うjdkの場所やJVM、プロキシの設定などが可能
- settings.gradle: gradleのrootprojectをしている。


### 導入手順

1. gradleのv2.14.1をダウンロード
2. jdkの1.8をダウンロード
3. ダウンロードしたjdkとgradleをtoolsの中に突っ込む
4. gradle.propertiesにjdkのパスを記載する
5. driverの中に自分が動かしたいブラウザのドライバーを入れる
6. test/javaの配下にテストを行いたいコードを入れる
7. 環境変数にgradleのパスを通す。
8. テストが完成したら以下コマンドにて実行 "gradle -g libs clean build"

### 参考サイト
https://qiita.com/navekazu/items/af886fa200be8a683132
